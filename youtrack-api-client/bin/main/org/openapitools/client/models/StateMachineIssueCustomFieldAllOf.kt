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

import org.openapitools.client.models.Event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param `value` 
 * @param event 
 * @param possibleEvents 
 */


data class StateMachineIssueCustomFieldAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.Any? = null,

    @Json(name = "event")
    val event: Event? = null,

    @Json(name = "possibleEvents")
    val possibleEvents: kotlin.collections.List<Event>? = null

)

