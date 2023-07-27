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

import org.openapitools.client.models.IssueCustomField
import org.openapitools.client.models.PeriodValue
import org.openapitools.client.models.ProjectCustomField

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the period field in the issue.
 *
 * @param id 
 * @param name 
 * @param projectCustomField 
 * @param `value` 
 * @param dollarType 
 */


data class PeriodIssueCustomField (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    override val name: kotlin.String? = null,

    @Json(name = "projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @Json(name = "value")
    val `value`: PeriodValue? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null

) : IssueCustomField

