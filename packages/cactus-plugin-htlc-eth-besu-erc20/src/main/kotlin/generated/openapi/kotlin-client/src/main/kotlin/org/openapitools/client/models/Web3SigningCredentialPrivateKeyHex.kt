/**
 * Hyperledger Cactus Plugin - HTLC ETH BESU ERC20
 *
 * Allows Cactus nodes to interact with HTLC contracts with ERC-20 Tokens
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Web3SigningCredentialType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param ethAccount The ethereum account (public key) that the credential belongs to. Basically the username in the traditional terminology of authentication.
 * @param secret The HEX encoded private key of an eth account.
 */

data class Web3SigningCredentialPrivateKeyHex (

    @Json(name = "type")
    val type: Web3SigningCredentialType,

    /* The ethereum account (public key) that the credential belongs to. Basically the username in the traditional terminology of authentication. */
    @Json(name = "ethAccount")
    val ethAccount: kotlin.String,

    /* The HEX encoded private key of an eth account. */
    @Json(name = "secret")
    val secret: kotlin.String

)
