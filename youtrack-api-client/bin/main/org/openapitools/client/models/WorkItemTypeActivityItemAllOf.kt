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
import org.openapitools.client.models.WorkItemType

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


data class WorkItemTypeActivityItemAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "target")
    val target: IssueWorkItem? = null,

    @Json(name = "removed")
    val removed: kotlin.collections.List<WorkItemType>? = null,

    @Json(name = "added")
    val added: kotlin.collections.List<WorkItemType>? = null

)
