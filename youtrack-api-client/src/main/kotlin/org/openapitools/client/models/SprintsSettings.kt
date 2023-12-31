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

import org.openapitools.client.models.CustomField
import org.openapitools.client.models.Sprint

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Describes sprints configuration.
 *
 * @param id 
 * @param isExplicit 
 * @param cardOnSeveralSprints 
 * @param defaultSprint 
 * @param disableSprints 
 * @param explicitQuery 
 * @param sprintSyncField 
 * @param hideSubtasksOfCards 
 * @param dollarType 
 */


interface SprintsSettings {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "isExplicit")
    val isExplicit: kotlin.Boolean?
    @Json(name = "cardOnSeveralSprints")
    val cardOnSeveralSprints: kotlin.Boolean?
    @Json(name = "defaultSprint")
    val defaultSprint: Sprint?
    @Json(name = "disableSprints")
    val disableSprints: kotlin.Boolean?
    @Json(name = "explicitQuery")
    val explicitQuery: kotlin.String?
    @Json(name = "sprintSyncField")
    val sprintSyncField: CustomField?
    @Json(name = "hideSubtasksOfCards")
    val hideSubtasksOfCards: kotlin.Boolean?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

