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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * For an issue that was imported from another service, represents the reference to the issue in the external system.
 *
 * @param id 
 * @param name 
 * @param url 
 * @param key 
 * @param dollarType 
 */


interface ExternalIssue {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "url")
    val url: kotlin.String?
    @Json(name = "key")
    val key: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

