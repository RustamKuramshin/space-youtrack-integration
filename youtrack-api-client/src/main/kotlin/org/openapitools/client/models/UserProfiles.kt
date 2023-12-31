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

import org.openapitools.client.models.GeneralUserProfile
import org.openapitools.client.models.NotificationsUserProfile
import org.openapitools.client.models.TimeTrackingUserProfile

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a group of settings of a user profile in YouTrack.
 *
 * @param id 
 * @param general 
 * @param notifications 
 * @param timetracking 
 * @param dollarType 
 */


interface UserProfiles {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "general")
    val general: GeneralUserProfile?
    @Json(name = "notifications")
    val notifications: NotificationsUserProfile?
    @Json(name = "timetracking")
    val timetracking: TimeTrackingUserProfile?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

