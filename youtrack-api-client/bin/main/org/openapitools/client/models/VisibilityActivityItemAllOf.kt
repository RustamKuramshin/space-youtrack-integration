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
 * 
 *
 * @param id 
 * @param targetMember 
 * @param targetSubMember 
 */


data class VisibilityActivityItemAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "targetMember")
    val targetMember: kotlin.String? = null,

    @Json(name = "targetSubMember")
    val targetSubMember: kotlin.String? = null

)

