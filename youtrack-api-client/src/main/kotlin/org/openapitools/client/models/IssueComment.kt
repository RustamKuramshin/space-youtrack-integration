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

import org.openapitools.client.models.Issue
import org.openapitools.client.models.IssueAttachment
import org.openapitools.client.models.User
import org.openapitools.client.models.Visibility

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an existing issue comment.
 *
 * @param id 
 * @param text 
 * @param textPreview 
 * @param created 
 * @param updated 
 * @param author 
 * @param issue 
 * @param attachments 
 * @param visibility 
 * @param deleted 
 * @param dollarType 
 */


interface IssueComment {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "text")
    val text: kotlin.String?
    @Json(name = "textPreview")
    val textPreview: kotlin.String?
    @Json(name = "created")
    val created: kotlin.Long?
    @Json(name = "updated")
    val updated: kotlin.Long?
    @Json(name = "author")
    val author: User?
    @Json(name = "issue")
    val issue: Issue?
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<IssueAttachment>?
    @Json(name = "visibility")
    val visibility: Visibility?
    @Json(name = "deleted")
    val deleted: kotlin.Boolean?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

