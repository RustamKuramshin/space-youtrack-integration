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

import org.openapitools.client.models.AgileColumnFieldValue
import org.openapitools.client.models.ColumnSettings
import org.openapitools.client.models.WIPLimit

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents settings for a single board column
 *
 * @param id 
 * @param presentation 
 * @param isResolved 
 * @param ordinal 
 * @param parent 
 * @param wipLimit 
 * @param fieldValues 
 * @param dollarType 
 */


interface AgileColumn {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "presentation")
    val presentation: kotlin.String?
    @Json(name = "isResolved")
    val isResolved: kotlin.Boolean?
    @Json(name = "ordinal")
    val ordinal: kotlin.Int?
    @Json(name = "parent")
    val parent: ColumnSettings?
    @Json(name = "wipLimit")
    val wipLimit: WIPLimit?
    @Json(name = "fieldValues")
    val fieldValues: kotlin.collections.List<AgileColumnFieldValue>?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}
