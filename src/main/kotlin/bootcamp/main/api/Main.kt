package bootcamp.main.api

import generated.bootcamp.TokenIssueFlowInitiatorPayload
import generated.examples.ArtTransferFlowInitiatorPayload
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import org.web3j.corda.api.CorDapp
import org.web3j.corda.api.Flow
import org.web3j.corda.dapps.LifeCycle
import org.web3j.corda.model.core.transactions.SignedTransaction
import org.web3j.corda.protocol.ClientBuilder
import org.web3j.corda.protocol.CordaException
import org.web3j.corda.protocol.CordaService

/**
 *  CorDapp wrapper.
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-13T11:30:04.71Z"
)
@Path("/api/rest/cordapps/bootcamp-cordapp.jar/")
interface Main : CorDapp {

    @get:Path("flows")
    override val flows: FlowResource

    interface FlowResource : org.web3j.corda.api.FlowResource {

        /**
         * Get the TokenIssueFlowInitiator flow.
         */
        @get:Path("bootcamp.TokenIssueFlowInitiator")
        val tokenIssueFlowInitiator: TokenIssueFlowInitiator

        /**
         * Main TokenIssueFlowInitiator flow.
         */
        interface TokenIssueFlowInitiator : Flow {

            /**
             * Start the TokenIssueFlowInitiator flow.
             */
            @POST
            @Produces("application/json")
            @Consumes("application/json")
            fun start(payload: generated.bootcamp.TokenIssueFlowInitiatorPayload): org.web3j.corda.model.core.transactions.SignedTransaction
        }

        /**
         * Get the ArtTransferFlowInitiator flow.
         */
        @get:Path("examples.ArtTransferFlowInitiator")
        val artTransferFlowInitiator: ArtTransferFlowInitiator

        /**
         * Main ArtTransferFlowInitiator flow.
         */
        interface ArtTransferFlowInitiator : Flow {

            /**
             * Start the ArtTransferFlowInitiator flow.
             */
            @POST
            @Consumes("application/json")
            fun start(payload: generated.examples.ArtTransferFlowInitiatorPayload)
        }
    }

    /**
     * Main CorDapp lifecycle methods.
     */
    companion object : LifeCycle<Main> {

        /**
         * Loads an existing Main CorDapp instance.
         */
        override fun load(service: CordaService) = ClientBuilder.build(
            Main::class.java, service, CordaException.Companion::of
        )
    }
}
