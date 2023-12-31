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

import org.openapitools.client.models.IssueFolder
import org.openapitools.client.models.User
import org.openapitools.client.models.UserGroup
import org.openapitools.client.models.WatchFolderSharingSettings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * `WatchFolder` is a common abstract ancestor for saved searches and tags.
 *
 * @param id 
 * @param name 
 * @param dollarType 
 * @param owner 
 * @param visibleFor 
 * @param updateableBy 
 * @param readSharingSettings 
 * @param updateSharingSettings 
 */


data class WatchFolder (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    override val name: kotlin.String? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null,

    @Json(name = "owner")
    val owner: User? = null,

    @Json(name = "visibleFor")
    val visibleFor: UserGroup? = null,

    @Json(name = "updateableBy")
    val updateableBy: UserGroup? = null,

    @Json(name = "readSharingSettings")
    val readSharingSettings: WatchFolderSharingSettings? = null,

    @Json(name = "updateSharingSettings")
    val updateSharingSettings: WatchFolderSharingSettings? = null

) : IssueFolder

