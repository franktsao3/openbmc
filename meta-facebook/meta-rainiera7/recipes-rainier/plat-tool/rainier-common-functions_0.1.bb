LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

S = "${UNPACKDIR}"

RDEPENDS:${PN} += " bash libgpiod-tools fb-common-functions"

SRC_URI += " \
    file://rainier-common-functions \
    "

do_install() {
    install -d ${D}${libexecdir}
    install -m 0755 ${UNPACKDIR}/rainier-common-functions ${D}${libexecdir}
}
