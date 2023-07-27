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

import org.openapitools.client.models.PeriodFieldFormat

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents time tracking settings in the user's profile.
 *
 * @param id 
 * @param periodFormat 
 * @param dollarType 
 */


interface TimeTrackingUserProfile {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "periodFormat")
    val periodFormat: PeriodFieldFormat?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

