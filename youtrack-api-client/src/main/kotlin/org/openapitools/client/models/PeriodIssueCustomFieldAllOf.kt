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

import org.openapitools.client.models.PeriodValue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param `value` 
 */


data class PeriodIssueCustomFieldAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "value")
    val `value`: PeriodValue? = null

)

