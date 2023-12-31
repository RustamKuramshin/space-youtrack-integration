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

import org.openapitools.client.models.BaseWorkItem
import org.openapitools.client.models.WorkItemAttributeValue
import org.openapitools.client.models.WorkItemProjectAttribute

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the attribute of a specific work item.
 *
 * @param id 
 * @param workItem 
 * @param projectAttribute 
 * @param `value` 
 * @param name 
 * @param dollarType 
 */


interface WorkItemAttribute {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "workItem")
    val workItem: BaseWorkItem?
    @Json(name = "projectAttribute")
    val projectAttribute: WorkItemProjectAttribute?
    @Json(name = "value")
    val `value`: WorkItemAttributeValue?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

