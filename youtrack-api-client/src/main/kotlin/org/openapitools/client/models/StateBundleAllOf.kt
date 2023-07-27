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

import org.openapitools.client.models.StateBundleElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param propertyValues 
 */


data class StateBundleAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "values")
    val propertyValues: kotlin.collections.List<StateBundleElement>? = null

)

