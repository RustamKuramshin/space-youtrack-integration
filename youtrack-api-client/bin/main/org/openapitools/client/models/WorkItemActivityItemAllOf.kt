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

import org.openapitools.client.models.IssueWorkItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param target 
 * @param removed 
 * @param added 
 */


data class WorkItemActivityItemAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "target")
    val target: IssueWorkItem? = null,

    @Json(name = "removed")
    val removed: kotlin.collections.List<IssueWorkItem>? = null,

    @Json(name = "added")
    val added: kotlin.collections.List<IssueWorkItem>? = null

)

