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

import org.openapitools.client.models.Project
import org.openapitools.client.models.UserGroup
import org.openapitools.client.models.VcsServer

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The basic entity that represents a VCS or a build server integration configured for a project.
 *
 * @param id 
 * @param server 
 * @param project 
 * @param relatedProjects 
 * @param enabled 
 * @param visibleForGroups 
 * @param addComments 
 * @param lookupIssuesInBranchName 
 * @param dollarType 
 */


interface ChangesProcessor {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "server")
    val server: VcsServer?
    @Json(name = "project")
    val project: Project?
    @Json(name = "relatedProjects")
    val relatedProjects: kotlin.collections.List<Project>?
    @Json(name = "enabled")
    val enabled: kotlin.Boolean?
    @Json(name = "visibleForGroups")
    val visibleForGroups: kotlin.collections.List<UserGroup>?
    @Json(name = "addComments")
    val addComments: kotlin.Boolean?
    @Json(name = "lookupIssuesInBranchName")
    val lookupIssuesInBranchName: kotlin.Boolean?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
}

