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
 * Represents visibility settings of an entity, for example, an issue or a comment.
 *
 * @param id 
 * @param dollarType 
 */


interface Visibility {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

