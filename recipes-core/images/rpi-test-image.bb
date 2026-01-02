# Base this image on core-image-base

include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " packagegroup-rpi-test"

# Testing GPIO pins
IMAGE_INSTALL:append = " libgpiod libgpiod-tools"

DISTRO_FEATURES:remove = " x11 "