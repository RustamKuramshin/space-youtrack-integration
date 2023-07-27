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
 * Company logo that is used in YouTrack.
 *
 * @param id 
 * @param url 
 * @param dollarType 
 */


interface Logo {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "url")
    val url: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

