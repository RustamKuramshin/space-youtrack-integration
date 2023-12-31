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

import org.openapitools.client.models.AppearanceSettings
import org.openapitools.client.models.License
import org.openapitools.client.models.LocaleSettings
import org.openapitools.client.models.NotificationSettings
import org.openapitools.client.models.RestCorsSettings
import org.openapitools.client.models.SystemSettings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents application-wide settings.
 *
 * @param id 
 * @param systemSettings 
 * @param notificationSettings 
 * @param restSettings 
 * @param appearanceSettings 
 * @param localeSettings 
 * @param license 
 * @param dollarType 
 */


interface GlobalSettings {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "systemSettings")
    val systemSettings: SystemSettings?
    @Json(name = "notificationSettings")
    val notificationSettings: NotificationSettings?
    @Json(name = "restSettings")
    val restSettings: RestCorsSettings?
    @Json(name = "appearanceSettings")
    val appearanceSettings: AppearanceSettings?
    @Json(name = "localeSettings")
    val localeSettings: LocaleSettings?
    @Json(name = "license")
    val license: License?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

