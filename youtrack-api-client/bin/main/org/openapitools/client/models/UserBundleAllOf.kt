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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param groups 
 * @param individuals 
 * @param aggregatedUsers 
 */


data class UserBundleAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<UserGroup>? = null,

    @Json(name = "individuals")
    val individuals: kotlin.collections.List<User>? = null,

    @Json(name = "aggregatedUsers")
    val aggregatedUsers: kotlin.collections.List<User>? = null

)
