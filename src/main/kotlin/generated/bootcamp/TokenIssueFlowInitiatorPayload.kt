package generated.bootcamp

import javax.annotation.Generated
import org.web3j.corda.model.core.identity.Party

/**
*
* @param amount
* @param owner
*/
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-13T11:30:04.601Z"
)
data class TokenIssueFlowInitiatorPayload(
    val amount: kotlin.Int,
    val owner: org.web3j.corda.model.core.identity.Party? = null
)
