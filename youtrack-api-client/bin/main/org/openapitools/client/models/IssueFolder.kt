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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an issue folder, such as a project, a saved search, or a tag.
 *
 * @param id 
 * @param name 
 * @param dollarType 
 */


interface IssueFolder {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

