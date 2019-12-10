package bootcamp.main.api

import org.junit.jupiter.api.Test
import org.web3j.corda.network.network
import org.web3j.corda.network.nodes
import org.web3j.corda.network.notary
import org.web3j.corda.network.party
import java.io.File
import javax.annotation.Generated

@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-10T14:50:58.71Z"
)
class MainTest {

    private val network = network {
        directory = File(System.getProperty("user.dir")).parentFile
        nodes {
            notary {
                name = "O=Notary, L=London, C=GB"
            }
            party {
                name = "O=PartyA, L=London, C=GB"
            }
            party {
                name = "O=PartyB, L=London, C=GB"
            }
        }
    }

    private lateinit var generatedBootcampTokenIssueFlowInitiatorPayload: generated.bootcamp.TokenIssueFlowInitiatorPayload

    @Test
    fun `start the TokenIssueFlowInitiator flow`() {
        val generatedBootcampTokenIssueFlowInitiatorPayload = generated.bootcamp.TokenIssueFlowInitiatorPayload(
            network.parties[1].corda.api.network.nodes.self.legalIdentities[0], 10
        )
        Main.load(network.parties[0].corda.service).flows.tokenIssueFlowInitiator
            .start(generatedBootcampTokenIssueFlowInitiatorPayload).apply { println(this) }
    }
    
    private lateinit var generatedExamplesArtTransferFlowInitiatorPayload: generated.examples.ArtTransferFlowInitiatorPayload

    @Test
    fun `start the ArtTransferFlowInitiator flow`() {
        val generatedExamplesArtTransferFlowInitiatorPayload = generated.examples.ArtTransferFlowInitiatorPayload(
            "The Scream", "Eduard Munch",
            network.parties[1].corda.api.network.nodes.self.legalIdentities[0]
        )
        Main.load(network.parties[0].corda.service).flows.artTransferFlowInitiator
            .start(generatedExamplesArtTransferFlowInitiatorPayload).apply { println(this) }
    }
}
