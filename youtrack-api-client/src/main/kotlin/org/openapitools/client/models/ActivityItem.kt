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
import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a change in an issue or in its related entities. In the UI, you see these changes as the Activity stream. It shows a feed of all updates of the issue: issue history, comments, attachments, VCS changes, work items, and so on.
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


interface ActivityItem {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "author")
    val author: User?
    @Json(name = "timestamp")
    val timestamp: kotlin.Long?
    @Json(name = "removed")
    val removed: kotlin.Any?
    @Json(name = "added")
    val added: kotlin.Any?
    @Json(name = "target")
    val target: kotlin.Any?
    @Json(name = "targetMember")
    val targetMember: kotlin.String?
    @Json(name = "field")
    val `field`: FilterField?
    @Json(name = "category")
    val category: ActivityCategory?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

