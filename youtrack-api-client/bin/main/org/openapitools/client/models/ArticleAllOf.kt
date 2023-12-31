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

import org.openapitools.client.models.Article
import org.openapitools.client.models.ArticleAttachment
import org.openapitools.client.models.ArticleComment
import org.openapitools.client.models.ExternalArticle
import org.openapitools.client.models.Project
import org.openapitools.client.models.Tag
import org.openapitools.client.models.User
import org.openapitools.client.models.Visibility

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param attachments 
 * @param childArticles 
 * @param comments 
 * @param content 
 * @param created 
 * @param externalArticle 
 * @param hasChildren 
 * @param hasStar 
 * @param idReadable 
 * @param ordinal 
 * @param parentArticle 
 * @param project 
 * @param reporter 
 * @param summary 
 * @param tags 
 * @param updated 
 * @param updatedBy 
 * @param visibility 
 */


data class ArticleAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "attachments")
    val attachments: kotlin.collections.List<ArticleAttachment>? = null,

    @Json(name = "childArticles")
    val childArticles: kotlin.collections.List<Article>? = null,

    @Json(name = "comments")
    val comments: kotlin.collections.List<ArticleComment>? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "created")
    val created: kotlin.Long? = null,

    @Json(name = "externalArticle")
    val externalArticle: ExternalArticle? = null,

    @Json(name = "hasChildren")
    val hasChildren: kotlin.Boolean? = null,

    @Json(name = "hasStar")
    val hasStar: kotlin.Boolean? = null,

    @Json(name = "idReadable")
    val idReadable: kotlin.String? = null,

    @Json(name = "ordinal")
    val ordinal: kotlin.Long? = null,

    @Json(name = "parentArticle")
    val parentArticle: Article? = null,

    @Json(name = "project")
    val project: Project? = null,

    @Json(name = "reporter")
    val reporter: User? = null,

    @Json(name = "summary")
    val summary: kotlin.String? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<Tag>? = null,

    @Json(name = "updated")
    val updated: kotlin.Long? = null,

    @Json(name = "updatedBy")
    val updatedBy: User? = null,

    @Json(name = "visibility")
    val visibility: Visibility? = null

)

