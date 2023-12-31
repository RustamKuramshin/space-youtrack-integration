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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents default project-related settings of the custom field. These settings are applied at the moment when the custom field is attached to a project. After that, any changes in default settings do not affect the field settings for this project.
 *
 * @param id 
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param dollarType 
 */


interface CustomFieldDefaults {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "canBeEmpty")
    val canBeEmpty: kotlin.Boolean?
    @Json(name = "emptyFieldText")
    val emptyFieldText: kotlin.String?
    @Json(name = "isPublic")
    val isPublic: kotlin.Boolean?
    @Json(name = "parent")
    val parent: CustomField?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

