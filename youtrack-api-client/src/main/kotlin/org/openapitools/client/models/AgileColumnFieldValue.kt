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

import org.openapitools.client.models.DatabaseAttributeValue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a field value or values, parameterizing agile column.
 *
 * @param id 
 * @param dollarType 
 * @param name 
 * @param isResolved 
 */


data class AgileColumnFieldValue (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "isResolved")
    val isResolved: kotlin.Boolean? = null

) : DatabaseAttributeValue

