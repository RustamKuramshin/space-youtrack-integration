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
 * Represents the duration value and its visual presentation.
 *
 * @param id 
 * @param minutes 
 * @param presentation 
 * @param dollarType 
 */


interface DurationValue {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "minutes")
    val minutes: kotlin.Int?
    @Json(name = "presentation")
    val presentation: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

