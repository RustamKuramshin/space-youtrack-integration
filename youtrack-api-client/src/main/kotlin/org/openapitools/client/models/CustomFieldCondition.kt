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

import org.openapitools.client.models.ProjectCustomField

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the condition for showing a custom field.
 *
 * @param id 
 * @param parent 
 * @param dollarType 
 */


interface CustomFieldCondition {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "parent")
    val parent: ProjectCustomField?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

