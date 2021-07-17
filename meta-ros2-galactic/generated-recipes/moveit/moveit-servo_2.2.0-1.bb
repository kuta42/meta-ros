# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Provides real-time manipulator Cartesian and joint servoing."
AUTHOR = "Blake Anderson <blakeanderson@utexas.edu>"
ROS_AUTHOR = "Brian O'Neil"
HOMEPAGE = "https://ros-planning.github.io/moveit_tutorials"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=f5654d47d02d927c4f7a04f0a51abaa1"

ROS_CN = "moveit"
ROS_BPN = "moveit_servo"

ROS_BUILD_DEPENDS = " \
    control-msgs \
    control-toolbox \
    geometry-msgs \
    moveit-common \
    moveit-msgs \
    moveit-ros-planning-interface \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    control-msgs \
    control-toolbox \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-planning-interface \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    control-toolbox \
    geometry-msgs \
    joy \
    moveit-msgs \
    moveit-ros-planning-interface \
    robot-state-publisher \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    moveit-resources-panda-moveit-config \
    ros-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/moveit2-release/archive/release/galactic/moveit_servo/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/moveit_servo"
SRC_URI = "git://github.com/moveit/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe447084d8a03a87d88e4e9496d731df2827a0df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
