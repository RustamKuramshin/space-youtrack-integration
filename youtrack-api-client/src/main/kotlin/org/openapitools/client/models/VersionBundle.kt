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

import org.openapitools.client.models.BaseBundle
import org.openapitools.client.models.VersionBundleElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a set of versions in YouTrack.
 *
 * @param id 
 * @param isUpdateable 
 * @param dollarType 
 * @param propertyValues 
 */


data class VersionBundle (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "isUpdateable")
    override val isUpdateable: kotlin.Boolean? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null,

    @Json(name = "values")
    val propertyValues: kotlin.collections.List<VersionBundleElement>? = null

) : BaseBundle
