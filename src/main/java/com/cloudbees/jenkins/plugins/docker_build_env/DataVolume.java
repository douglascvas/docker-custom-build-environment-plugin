package com.cloudbees.jenkins.plugins.docker_build_env;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class DataVolume extends AbstractDescribableImpl<DataVolume> {

    private final String volumeName;

    @DataBoundConstructor
    public DataVolume(String volumeName) {
        this.volumeName = volumeName;
    }

    public String getVolumeName() {
        return volumeName;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<DataVolume> {

        @Override
        public String getDisplayName() {
            return "Data Volume";
        }
    }
}
