# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Metapackage for Clearpath Husky visualization software"
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
HOMEPAGE = "http://ros.org/wiki/husky_desktop"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "husky"
ROS_BPN = "husky_desktop"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    husky-msgs \
    husky-viz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    husky-msgs \
    husky-viz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_desktop/0.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3c6ffae939a9c0e4f24622e4ed31727a"
SRC_URI[sha256sum] = "bb9cd0fe8ce35a3c2cd8628bc6e5856b732545abfd996d5d55e00cccb89e381f"
S = "${WORKDIR}/husky-release-release-melodic-husky_desktop-0.4.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('husky', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('husky', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/husky/husky_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/husky/husky-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/husky/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/husky/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
