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
import org.openapitools.client.models.VcsChange

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param removed 
 * @param added 
 * @param author 
 */


data class VcsChangeActivityItemAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "removed")
    val removed: kotlin.collections.List<VcsChange>? = null,

    @Json(name = "added")
    val added: kotlin.collections.List<VcsChange>? = null,

    @Json(name = "author")
    val author: User? = null

)
