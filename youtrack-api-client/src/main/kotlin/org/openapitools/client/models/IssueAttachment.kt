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
import org.openapitools.client.models.IssueComment
import org.openapitools.client.models.User
import org.openapitools.client.models.Visibility

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a file that is attached to an issue or a comment.
 *
 * @param id 
 * @param name 
 * @param author 
 * @param created 
 * @param updated 
 * @param propertySize 
 * @param extension 
 * @param charset 
 * @param mimeType 
 * @param metaData 
 * @param draft 
 * @param removed 
 * @param base64Content 
 * @param url 
 * @param visibility 
 * @param issue 
 * @param comment 
 * @param thumbnailURL 
 * @param dollarType 
 */


interface IssueAttachment {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "author")
    val author: User?
    @Json(name = "created")
    val created: kotlin.Long?
    @Json(name = "updated")
    val updated: kotlin.Long?
    @Json(name = "size")
    val propertySize: kotlin.Long?
    @Json(name = "extension")
    val extension: kotlin.String?
    @Json(name = "charset")
    val charset: kotlin.String?
    @Json(name = "mimeType")
    val mimeType: kotlin.String?
    @Json(name = "metaData")
    val metaData: kotlin.String?
    @Json(name = "draft")
    val draft: kotlin.Boolean?
    @Json(name = "removed")
    val removed: kotlin.Boolean?
    @Json(name = "base64Content")
    val base64Content: kotlin.String?
    @Json(name = "url")
    val url: kotlin.String?
    @Json(name = "visibility")
    val visibility: Visibility?
    @Json(name = "issue")
    val issue: Issue?
    @Json(name = "comment")
    val comment: IssueComment?
    @Json(name = "thumbnailURL")
    val thumbnailURL: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

