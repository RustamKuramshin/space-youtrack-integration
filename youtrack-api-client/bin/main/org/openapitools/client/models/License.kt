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
 * Represents the current license of the YouTrack service.
 *
 * @param id 
 * @param username 
 * @param license 
 * @param error 
 * @param dollarType 
 */


interface License {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "username")
    val username: kotlin.String?
    @Json(name = "license")
    val license: kotlin.String?
    @Json(name = "error")
    val error: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

