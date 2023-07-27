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
 * Represents the command that was parsed from the provided query.
 *
 * @param id 
 * @param description 
 * @param error 
 * @param delete 
 * @param dollarType 
 */


interface ParsedCommand {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "description")
    val description: kotlin.String?
    @Json(name = "error")
    val error: kotlin.Boolean?
    @Json(name = "delete")
    val delete: kotlin.Boolean?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}
