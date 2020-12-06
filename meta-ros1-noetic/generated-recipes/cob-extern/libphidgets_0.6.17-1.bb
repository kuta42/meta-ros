# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package wraps the libphidgets to use it as a ros dependency"
AUTHOR = "Benjamin Maidel <benjamin.maidel@ipa.fraunhofer.de>"
ROS_AUTHOR = "Alexander Bubeck"
HOMEPAGE = "http://ros.org/wiki/libphidgets"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "cob_extern"
ROS_BPN = "libphidgets"

ROS_BUILD_DEPENDS = " \
    libusb1 \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libusb1 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libusb1 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_extern-release/archive/release/noetic/libphidgets/0.6.17-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/libphidgets"
SRC_URI = "git://github.com/ipa320/cob_extern-release;${ROS_BRANCH};protocol=https"
SRCREV = "77b59542f53ff56a61390823ea0a03bd6cf451ac"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
