package generated.examples

import javax.annotation.Generated
import org.web3j.corda.model.core.identity.Party

/**
*
* @param title
* @param artist
* @param newOwner
*/
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-10T14:50:58.645Z"
)
data class ArtTransferFlowInitiatorPayload(
    val title: kotlin.String,
    val artist: kotlin.String,
    val newOwner: org.web3j.corda.model.core.identity.Party
)
