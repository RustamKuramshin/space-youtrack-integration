/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.VcsHostingServer

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a self-hosted Bitbucket server.
 *
 * @param id 
 * @param url 
 * @param dollarType 
 */


data class BitbucketStandaloneServer (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null

) : VcsHostingServer

