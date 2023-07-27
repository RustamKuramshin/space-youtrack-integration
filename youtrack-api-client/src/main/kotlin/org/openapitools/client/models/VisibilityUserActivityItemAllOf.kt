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

import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param targetMember 
 * @param targetSubMember 
 * @param removed 
 * @param added 
 */


data class VisibilityUserActivityItemAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "targetMember")
    val targetMember: kotlin.String? = null,

    @Json(name = "targetSubMember")
    val targetSubMember: kotlin.String? = null,

    @Json(name = "removed")
    val removed: kotlin.collections.List<User>? = null,

    @Json(name = "added")
    val added: kotlin.collections.List<User>? = null

)
