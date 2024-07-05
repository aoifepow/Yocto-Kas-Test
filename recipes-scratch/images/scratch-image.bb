DESCRIPTION = "A core image for Meta-Scratch"
LICENSE = "MIT"

#Core files for basic console boot 
IMAGE_INSTALL = "packagegroup-core-boot"

#Add out desired extra files
IMAGE_INSTALL += " hello example"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

IMAGE_FEATURES = " debug-tweaks"
