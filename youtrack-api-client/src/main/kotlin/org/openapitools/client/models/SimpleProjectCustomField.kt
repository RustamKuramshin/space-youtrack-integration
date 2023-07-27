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
import org.openapitools.client.models.CustomFieldCondition
import org.openapitools.client.models.Project
import org.openapitools.client.models.ProjectCustomField

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents project settings for the fields of the following types: `integer`, `float`, `date`, `date and time`, `string`.
 *
 * @param id 
 * @param `field` 
 * @param project 
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param ordinal 
 * @param isPublic 
 * @param hasRunningJob 
 * @param condition 
 * @param dollarType 
 */


data class SimpleProjectCustomField (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "field")
    override val `field`: CustomField? = null,

    @Json(name = "project")
    override val project: Project? = null,

    @Json(name = "canBeEmpty")
    override val canBeEmpty: kotlin.Boolean? = null,

    @Json(name = "emptyFieldText")
    override val emptyFieldText: kotlin.String? = null,

    @Json(name = "ordinal")
    override val ordinal: kotlin.Int? = null,

    @Json(name = "isPublic")
    override val isPublic: kotlin.Boolean? = null,

    @Json(name = "hasRunningJob")
    override val hasRunningJob: kotlin.Boolean? = null,

    @Json(name = "condition")
    override val condition: CustomFieldCondition? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null

) : ProjectCustomField

