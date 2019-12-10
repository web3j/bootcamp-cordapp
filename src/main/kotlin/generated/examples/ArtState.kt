package generated.examples

import javax.annotation.Generated
import org.web3j.corda.model.core.identity.AbstractParty
import org.web3j.corda.model.core.identity.Party

/**
*
* @param artist
* @param title
* @param appraiser
* @param owner
* @param participants
*/
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-10T14:50:58.645Z"
)
data class ArtState(
    val artist: kotlin.String? = null,
    val title: kotlin.String? = null,
    val appraiser: org.web3j.corda.model.core.identity.Party? = null,
    val owner: org.web3j.corda.model.core.identity.Party? = null,
    val participants: kotlin.collections.List<org.web3j.corda.model.core.identity.AbstractParty>? = null
)
