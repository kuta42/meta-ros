# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "ROS2 package to interface with a GRBL serial device"
AUTHOR = "Evan Flynn <evanflynn.msu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "grbl_ros"
ROS_BPN = "grbl_ros"

ROS_BUILD_DEPENDS = " \
    grbl-msgs \
    python3-pyserial \
    rclpy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    grbl-msgs \
    rclpy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    grbl-msgs \
    rclpy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/flynneva/grbl_ros-release/archive/release/dashing/grbl_ros/0.0.15-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/grbl_ros"
SRC_URI = "git://github.com/flynneva/grbl_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "9c25076c55b18d2a347909ea8ca94a62d49f76ca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
