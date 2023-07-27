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

import org.openapitools.client.models.ActivityCategory
import org.openapitools.client.models.FilterField
import org.openapitools.client.models.IssueWorkItem
import org.openapitools.client.models.SingleValueActivityItem
import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a change in the `author` attribute of a work item.
 *
 * @param id 
 * @param author 
 * @param timestamp 
 * @param removed 
 * @param added 
 * @param target 
 * @param targetMember 
 * @param `field` 
 * @param category 
 * @param dollarType 
 */


data class WorkItemAuthorActivityItem (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "author")
    override val author: User? = null,

    @Json(name = "timestamp")
    override val timestamp: kotlin.Long? = null,

    @Json(name = "removed")
    val removed: User? = null,

    @Json(name = "added")
    val added: User? = null,

    @Json(name = "target")
    val target: IssueWorkItem? = null,

    @Json(name = "targetMember")
    override val targetMember: kotlin.String? = null,

    @Json(name = "field")
    override val `field`: FilterField? = null,

    @Json(name = "category")
    override val category: ActivityCategory? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null

) : SingleValueActivityItem

