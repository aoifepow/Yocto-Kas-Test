DESCRIPTION = "Image for testing factorial"

IMAGE_INSTALL = "packagegroup-core-boot"

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_INSTALL += " factorial"

IMAGE_FEATURES += " debug-tweaks"
