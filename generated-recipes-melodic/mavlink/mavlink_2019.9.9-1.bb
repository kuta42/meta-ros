# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 library   for both 1.0 and 2.0 versions of protocol.    For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Lorenz Meier"
HOMEPAGE = "https://mavlink.io/en/"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "mavlink"
ROS_BPN = "mavlink"

ROS_BUILD_DEPENDS = " \
    python \
    python-future \
    python-lxml \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.9.9-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "78f6944fd4c9c5f919164d36d9c33cef"
SRC_URI[sha256sum] = "ee07bda8eaa78c3587a0575b9ac48bdb7e55678c65ccd0cb347f32012ae21c93"
S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.9.9-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mavlink', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mavlink', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavlink/mavlink_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavlink/mavlink-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavlink/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavlink/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
