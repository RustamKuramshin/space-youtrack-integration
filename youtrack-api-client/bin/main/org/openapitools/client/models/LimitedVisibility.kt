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
import org.openapitools.client.models.UserGroup
import org.openapitools.client.models.Visibility

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents visibility limited to several users and/or groups.
 *
 * @param id 
 * @param dollarType 
 * @param permittedGroups 
 * @param permittedUsers 
 */


data class LimitedVisibility (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null,

    @Json(name = "permittedGroups")
    val permittedGroups: kotlin.collections.List<UserGroup>? = null,

    @Json(name = "permittedUsers")
    val permittedUsers: kotlin.collections.List<User>? = null

) : Visibility

