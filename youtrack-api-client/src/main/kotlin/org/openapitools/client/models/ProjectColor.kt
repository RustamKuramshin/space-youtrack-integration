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

import org.openapitools.client.models.FieldStyle
import org.openapitools.client.models.Project

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents color setting for one project on the board.
 *
 * @param id 
 * @param project 
 * @param color 
 * @param dollarType 
 */


interface ProjectColor {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "project")
    val project: Project?
    @Json(name = "color")
    val color: FieldStyle?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

