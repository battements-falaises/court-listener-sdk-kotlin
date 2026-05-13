# Changelog

## 0.1.0 (2026-05-13)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/battements-falaises/court-listener-sdk-kotlin/compare/v0.0.1...v0.1.0)

### Features

* **client:** improve logging ([0d7a3bf](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/0d7a3bf20962010bdcccb23a8cee64cbe507bcd6))
* **client:** more robust error parsing ([108cb71](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/108cb710d82c2c1044b90db13b291b338f77f5d1))
* **client:** support proxy authentication ([a2a75ed](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/a2a75ed49fc1f266fb9816a424dca303d2b605a1))
* support setting headers via env ([6717d21](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/6717d21a1843221ab77aff5d722abd6b664a3a00))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([84b4304](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/84b4304a23b7383eb58827d89633eefde05cec52))
* **client:** incorrect `Retry-After` parsing ([85c9090](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/85c909092c5c4aa21924c1404525a12bd07fa6fb))


### Performance Improvements

* **client:** create one json mapper ([f2f7ac3](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/f2f7ac3b447c7c531241b880a6aed4e6dd8b0d4d))


### Chores

* **ci:** skip lint on metadata-only changes ([06f0389](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/06f0389d686886af16e638fc8b232895e568b679))
* configure new SDK language ([9cc14bc](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/9cc14bc94b89347de4e969d54d196f46061bf8e6))
* configure new SDK language ([68c3062](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/68c306205af4392f65348c7fe773dbbd658e6cbd))
* configure new SDK language ([64909aa](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/64909aacfcd2e59b95418d9e188bd368bd124a00))
* **internal:** bump ktfmt ([866ae1e](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/866ae1ebb6071be46a118f362e70f43c1533e113))
* **internal:** bump palantir-java-format ([d8bade2](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/d8bade25dbbc8f49a0211768ccd824af80ea5125))
* **internal:** codegen related update ([f7ceb18](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/f7ceb182ac182bd01f21c66ea5beebb020873945))
* **internal:** tweak CI branches ([3eb4b73](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/3eb4b7332793c37e4f6792ae9c31220f6b7dedba))
* **internal:** update gitignore ([0735824](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/07358240c6ec8724e2b5dcec3144921654960e54))
* **internal:** update multipart form array serialization ([3dbca8c](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/3dbca8cd668b92d3e2f7bce3a6b37de7eb94b02d))
* **internal:** update retry delay tests ([6b53989](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/6b53989f981961c00cb58a98c243078bfc405e61))
* redact api-key headers in debug logs ([c9eebf8](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/c9eebf8ae6193c9c03e8edb97b1c56667110d94d))
* remove duplicated dokka setup ([28572cf](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/28572cfb0781204943055a69943d8635fe3e95b0))
* **test:** do not count install time for mock server timeout ([8ef068d](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/8ef068d22c2bdcbac626431cf5dfc0c1ad5353d8))
* **tests:** bump steady to v0.19.4 ([3c5e5b9](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/3c5e5b952d90eca48d7be4d132fec27b80c22a49))
* **tests:** bump steady to v0.19.5 ([97d4cea](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/97d4cea90883d813e89290a860286a1fe9843775))
* **tests:** bump steady to v0.19.6 ([bb50634](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/bb5063464498a33f50eceb8c1397ecca42f11964))
* **tests:** bump steady to v0.19.7 ([27f4230](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/27f4230179b583684082cbbc84d3d9ff58016d44))
* **tests:** bump steady to v0.20.1 ([4d0b449](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/4d0b4493f7ef7a211cf9790d4724196739064a82))
* **tests:** bump steady to v0.20.2 ([4cc7de3](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/4cc7de37c52028ce1ea419e99c220e90fc89f767))
* **tests:** bump steady to v0.22.1 ([1137556](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/11375560f5404ee0ac485ea569158a4a95cfa049))
* **tests:** change mock server to steady ([089cb13](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/089cb13ecfc306de252e5ee6d1e309fe0e49a0b1))
* update SDK settings ([73447c0](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/73447c06ac20b3dd3ec2b270aeee25a1ba59ddac))


### Documentation

* clarify forwards compat behavior ([4d1d966](https://github.com/battements-falaises/court-listener-sdk-kotlin/commit/4d1d9664c8fb8aeffaabffd7dd0c5311d8a137af))
