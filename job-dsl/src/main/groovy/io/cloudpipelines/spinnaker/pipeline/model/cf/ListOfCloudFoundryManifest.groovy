package io.cloudpipelines.spinnaker.pipeline.model.cf

import groovy.transform.CompileStatic

@CompileStatic
class ListOfCloudFoundryManifest {
	List<CloudFoundryManifest> applications
}
